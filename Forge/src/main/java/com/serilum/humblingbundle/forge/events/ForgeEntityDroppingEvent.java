package com.serilum.humblingbundle.forge.events;

import com.serilum.humblingbundle.events.EntityDroppingEvent;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeEntityDroppingEvent {
	@SubscribeEvent
	public static void mobItemDrop(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		EntityDroppingEvent.mobItemDrop(entity.level(), entity, e.getSource());
	}
}