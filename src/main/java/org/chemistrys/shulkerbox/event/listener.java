package org.chemistrys.shulkerbox.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class listener implements Listener {

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e)
    {
    }
    public PlayerAnimationEvent PlayerAnimationEvent(PlayerAnimationEvent e)
    {
        return e;
    }
}
