package com.zbq.mediator;

/**
 * ConcreteColleague
 * 具体同事类
 */
public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}

}
