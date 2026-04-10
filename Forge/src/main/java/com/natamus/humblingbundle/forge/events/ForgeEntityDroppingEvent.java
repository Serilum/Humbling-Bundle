package com.natamus.humblingbundle.forge.events;

import com.natamus.humblingbundle.events.EntityDroppingEvent;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeEntityDroppingEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeEntityDroppingEvent.class);

		LivingDropsEvent.BUS.addListener(ForgeEntityDroppingEvent::mobItemDrop);
	}

	@SubscribeEvent
	public static void mobItemDrop(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		EntityDroppingEvent.mobItemDrop(entity.level(), entity, e.getSource());
	}
}