// AUTHOR: KHAI NGUYEN

/* 
 * This class is designed to open and read text documents. In the case of 
 * this project, the document being viewed contains the NBA Top 100 Players
 * and their respective statistics. Given that Java cannot view Excel 
 * spreadsheets without additional plugins such as Apache POI, the data has
 * been converted to a text document under the following formatting.
 * 
 * [PLAYER RANKING]
 * [PLAYER TEAM]
 * [PLAYER FULL NAME]
 * [POINTS PER GAME (PPG)]
 * [REBOUNDS PER GAME (RPG)]
 * [ASSISTS PER GAME (APG)]
 * [FIELD GOAL PERCENTAGE (FGP)]
 * [FREE THROW PERCENTAGE (FTP)]
 * [PLAYER EFFICIENCY RATING (PER)]
 *
 * *Repeated for the NBA Top 100 Players
 *
 * *View Excel formatted data in project folder
 *
 * *All players and statistics are taken from the following websites:
 * **https://www.si.com/nba/top-100-nba-players-2020#20-11
 * **https://www.basketball-reference.com/
*/

import java.io.*;
import java.util.*;

public class TextReader {
   private String fileName; 
   private String line;
   
   //Default TextReader constructor contains file name of where data is stored
   public TextReader() {
      fileName = "NBATop100 - File Reader Format.txt";
   }
   
   //Returns the players on a team that are also on the NBA Top 100 list
   public ArrayList<String> getPlayersByTeam(String team) {
      ArrayList <String> ans = new ArrayList<String>();
      try {
         //Java imported reader of text documents
         BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
         
         //Iterate through each line in the text document and find where line equals team name
         while((line = reader.readLine()) != null) {
            if(line.equals(team)) {
               //Adds player to answer array
               ans.add(reader.readLine());
            }
         }
         
         //Closes Java reader to prevent data overflow
         reader.close();
         return ans;
      }
      
      //If error in opening text document catch
      catch (Exception e) {
         System.out.println("ERROR: Cannot open file " + this.fileName);
         return null;
      }
   }
   
   //Returns a player's statistic when specified. If no statistic type is specified, return all player statistics
   public ArrayList getPlayerStat(String player, String statType) {
      ArrayList <String> ans = new ArrayList<String>();
      try {
         //Java imported reader of text documents
         BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
         
         //Iterate through each line in the text document and find where line equals player name
         while((line = reader.readLine()) != null) {
            if(line.equals(player)) {
               switch(statType) {
                  //If statistic type is specified to PPG
                  case "PPG":
                     ans.add(reader.readLine());
                     break;
                  
                  //If statistic type is specified to RPG
                  case "RPG":
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                     
                  //If statistic type is specified to APG
                  case "APG":
                     reader.readLine();
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                     
                  //If statistic type is specified to FGP
                  case "FGP":
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                     
                  //If statistic type is specified to FTP
                  case "FTP":
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                     
                  //If statistic type is specified to PER
                  case "PER":
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                     
                  //If statistic type is specified to RANK
                  case "RANK":
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     reader.readLine();
                     ans.add(reader.readLine());
                     break;
                                          
                  //If statistic type is unknown
                  default:
                     for(int i = 0; i <= 5; i++) {
                        ans.add(reader.readLine());
                     }
               }           
            }
         }
      
         //Closes Java reader to prevent data overflow
         reader.close();
         return ans;
      }
      
      //If error in opening text document catch
      catch (Exception e) {
         System.out.println("ERROR: Cannot open file " + this.fileName);
         return null;
      }   
   }
   
   //Returns a player's statistic when specified. If no statistic type is specified, return all player statistics
   public ArrayList getStat(String statType) {
      ArrayList <String> ans = new ArrayList<String>();
      try {
         //Java imported reader of text documents
         BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
              
         switch(statType) {
            //If statistic type is specified to PPG
            case "PPG":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
               break;    
                  
            //If statistic type is specified to RPG
            case "RPG":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
               
               break;    
                     
            //If statistic type is specified to APG
            case "APG":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
               
               break;    
                     
            //If statistic type is specified to FGP
            case "FGP":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               } 
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
                
               break;    
                     
            //If statistic type is specified to FTP
            case "FTP":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
               
               break;    
                     
            //If statistic type is specified to PER
            case "PER":
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               reader.readLine();
               ans.add(reader.readLine());
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               
               if(ans.size() > 100) {
                  ans.remove(ans.size() - 1);
               }
               
               break;    
                     
            //If statistic type is specified to RANK
            case "RANK":
               while((line = reader.readLine()) != null) {
                  for(int i = 0; i <=7; i++) {
                     reader.readLine();
                  }
                  ans.add(reader.readLine());
               }  
               break;      
            
            //If statistic type is unknown
            default:
               break;
         }
      
         //Closes Java reader to prevent data overflow
         reader.close();
         return ans;
      }
      
      //If error in opening text document catch
      catch (Exception e) {
         System.out.println("ERROR: Cannot open file " + this.fileName);
         return null;
      }   
   }
      
   public static void main(String [] args) {
      TextReader text = new TextReader();
      ArrayList<String> players = text.getPlayersByTeam("Los Angeles Lakers");
      /*for(String player : players) {
         System.out.println(player);
         System.out.println(text.getPlayerStat(player, "RANK"));
      }*/
      System.out.println(text.getStat("RANK"));
      System.out.println(text.getStat("PPG"));
      System.out.println(text.getStat("RPG"));
      System.out.println(text.getStat("APG"));
      System.out.println(text.getStat("FGP"));
      System.out.println(text.getStat("FTP"));
      System.out.println(text.getStat("PER"));
   }
}
