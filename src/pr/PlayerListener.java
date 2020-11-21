package pr;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.item.Item;
import pr.Main;


public class PlayerListener implements Listener {




    public void PierdolniecieWItem(PlayerInteractEvent event)
    {
        if(event.getPlayer().getInventory().getItemInHand().equals(Main.instance.npcWand))
        {

        }
    }
}
