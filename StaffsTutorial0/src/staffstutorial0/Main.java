/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffstutorial0;

import java.util.ArrayList;

/**
 *
 * @author alexandre
 */
public class Main {
    public static void main(String[] args){
        Player p1=new Player("Player 1","Position 1", 18);
        Player p2=new Player("Player 2","Position 2", 20);
        Player p3=new Player("Player 3","Position 3", 17);
        Player p4=new Player("Player 4","Position 4", 22);
        Player p5=new Player("Player 5","Position 5", 19);
        Player p6=new Player("Player 6","Position 6", 22);
        System.out.println("Test to display some players : ");
        System.out.println(p1);
        System.out.println(p2);

        
        Team aTeam=new Team();
        aTeam.setTeamName("A-Team");
        aTeam.add(p1);
        aTeam.add(p2);
        System.out.println(aTeam.toString());
        
        Team bTeam=new Team("B-Team");
        bTeam.add(p3);
        bTeam.add(p4);
        System.out.println(bTeam);
        
        ArrayList<Player> list=new ArrayList<Player>();
        list.add(p5);
        list.add(p6);
        Team cTeam=new Team("C-Team", list);
        System.out.println(cTeam);

        
        
    }
    
}
