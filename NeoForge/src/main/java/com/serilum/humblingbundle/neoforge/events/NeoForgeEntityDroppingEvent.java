package com.serilum.humblingbundle.neoforge.events;

import com.serilum.humblingbundle.events.EntityDroppingEvent;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeEntityDroppingEvent {
	@SubscribeEvent
	public static void mobItemDrop(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		EntityDroppingEvent.mobItemDrop(entity.level(), entity, e.getSource());
	}
}