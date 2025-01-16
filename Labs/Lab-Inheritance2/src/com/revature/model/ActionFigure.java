package com.revature.model;

public class ActionFigure extends Doll {
	private String skill;
	
	//constructors
	public ActionFigure() {
			this.eyeColor = "golden";
			this.name = "SuperSomething";
			this.skill = "strength";
		}
		
		public ActionFigure(String name, String eyeColor, String skill) {
			this.name = name;
			this.eyeColor = eyeColor;
			this.skill = skill;
		}
		
		//getters and setters
		public String getSkill() {
			return this.skill;
		}
		
		public void setSkill(String skill) {
			this.skill = skill;
		}
			
		//other methods
		public void useSkill() {
			System.out.println("Ka Pow! I'm using my skill, "+this.skill);
		}
	}

