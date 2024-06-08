package ru.themixray.mixin;

import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ResourcePackStatusC2SPacket;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import ru.themixray.Main;

@Mixin(ClientConnection.class)
public abstract class ClientConnectionMixin {

	@Shadow
	public abstract void send(Packet<?> packet, @Nullable PacketCallbacks callbacks);

	/**
	 * @author TheMixRay
	 * @reason idk
	 */
	@Overwrite
	public void send(Packet<?> packet) {
		if (packet instanceof ResourcePackStatusC2SPacket) {
			this.send(new ResourcePackStatusC2SPacket(ResourcePackStatusC2SPacket.Status.SUCCESSFULLY_LOADED), null);
			Main.LOGGER.info("Ignored server's questions about resourcepack");
		} else {
			this.send(packet, null);
		}
	}
}