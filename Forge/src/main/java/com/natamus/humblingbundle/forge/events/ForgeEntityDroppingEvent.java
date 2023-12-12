package com.natamus.humblingbundle.forge.events;

import com.natamus.humblingbundle.events.EntityDroppingEvent;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeEntityDroppingEvent {
	@SubscribeEvent
	public void mobItemDrop(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		EntityDroppingEvent.mobItemDrop(entity.level, entity, e.getSource());
	}
}