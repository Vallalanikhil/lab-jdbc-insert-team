package dao;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	
	public void createTeam(Team team) {
		
		Integer id= team.getId();
		String name=team.getName();
		String Couch=team.getCoach();
		int captain=team.getCaptain();
		int city=team.getHome_city();
		ConnectionManager cm=new ConnectionManager();
		
		//insert data into database
		String sql="insert into TEAM(ID,NAME,COACH,HOME_CITY,CAPTAIN,)VALUES(?,?,?,?,?)";
		
		
		
		
	}

	public void createTeam1(Team team) {
		// TODO Auto-generated method stub
		
	}
}

