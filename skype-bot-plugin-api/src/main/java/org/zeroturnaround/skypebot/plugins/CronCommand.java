package org.zeroturnaround.skypebot.plugins;

import java.util.Map;

public interface CronCommand extends Command {

  long getCooldown();

  String[] getNecessaryConversationNames();

  /**
   * 
   * @return "Conversation name -> messages[] to post"
   */
  Map<String, String[]> fire(String... availableConversationNames);
}
