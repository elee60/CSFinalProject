// AUTHOR: KUNAL SINGH KHURANA

import java.util.*;

public class PlayerComparator extends Comparator{
  
  public PlayerComparator(){
    super();
  }
  
  @SuppressWarnings("unchecked")
  
  public String compare(String player1, String player2, String statCategory){
    String result = "";
    TextReader t1 = new TextReader();
    ArrayList<String> player1Array = t1.getPlayerStat(player1, statCategory);
    ArrayList<String> player2Array = t1.getPlayerStat(player2, statCategory);
    double player1Stat = Double.parseDouble(player1Array.get(0));
    double player2Stat = Double.parseDouble(player2Array.get(0));
    
    String statTypeWords = "";
    
    if (statCategory == "PPG"){
      statTypeWords = "points per game";}
    else if (statCategory == "APG"){
      statTypeWords = "assists per game";}
    else if (statCategory == "RPG"){
      statTypeWords = "rebounds per game";}
    else{
      statTypeWords = statCategory;}
      
    
    if (player1Stat > player2Stat){
      result += player1 + " averages more " + statTypeWords + " than " + player2 + ".";}
    else if (player2Stat > player1Stat){
      result += player2 + " averages more " + statTypeWords + " than " + player1 + ".";}
    else if (player1Stat == player2Stat){
      result += player1 + " and " + player2 + " average the same " + statTypeWords + ".";}
    System.out.println(result);
    return result;

    }
    
  
  public String compare(String player1, String player2){
    String pointsComparison = this.compare(player1, player2, "PPG");
    String reboundsComparison = this.compare(player1, player2, "RPG");
    String assistsComparison = this.compare(player1, player2, "APG");
    String fieldGoalComparison = this.compare(player1, player2, "FGP");
    String freeThrowComparison = this.compare(player1, player2, "FTP");
    String pERComparison = this.compare(player1, player2, "PER");
    //Include overall rank comparison via getRank() method
    
    String result = pointsComparison + "\n" + reboundsComparison + "\n" + assistsComparison + "\n" + fieldGoalComparison + "\n" + freeThrowComparison + "\n" + pERComparison;
    System.out.print(result);
    return result; }
  }
