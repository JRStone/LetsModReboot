package com.jrstone.letsmodreboot.handler;

import com.jrstone.letsmodreboot.reference.Reference;
import com.jrstone.letsmodreboot.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by jimst on 6/22/2016.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();

        }
    }
    @SubscribeEvent
    public void onCongfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
      {
          loadConfiguration();
      }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL, false, "This is a sample");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
