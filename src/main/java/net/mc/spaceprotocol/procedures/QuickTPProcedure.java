package net.mc.spaceprotocol.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class QuickTPProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer(), event.getRawText());
	}

	public static void execute(Entity entity, String text) {
		execute(null, entity, text);
	}

	private static void execute(@Nullable Event event, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if ((text).equals("#d")) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute in space_protocol:alien_destroyer run tp @p 0 64 0");
				}
			}
		}
	}
}