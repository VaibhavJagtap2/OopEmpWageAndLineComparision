package com.oopempwagerefractor;

import java.util.Scanner;

public class OopEmpWageRefractor
{

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	private final String company;
	private final int EmpRatePerHr;
	private final int numOfWorkingDays;
	private final int maxWorkingHr;

		public OopEmpWageRefractor(String company,int EmpRatePerHr,int numOfWorkingDays,int maxWorkingHr)
		{
			this.company=company;
			this.EmpRatePerHr=EmpRatePerHr;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxWorkingHr=maxWorkingHr;
			
		}
		private void computeEmpWage()
	{
                int empHr=0,totalEmpWage=0,empWage=0,totalEmpHr=0,totalWorkingDays=0;
                
				while(totalEmpHr<=maxWorkingHr && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                int Result=(int)(Math.random()*10)%3;

                        switch(Result)
                        {
                                case FULL_TIME:
                                        empHr=8;
                                        break;
                                case PART_TIME:
                                        empHr=4;
                                        break;
                                default:
                                        empHr=0;
                        }
                        empWage=empHr*EmpRatePerHr;
                        totalEmpWage+=empWage;

                }

                totalEmpWage=totalEmpWage*EmpRatePerHr;

                System.out.println("company :"+company+"Salary is :"+totalEmpWage);
	}
 	public static void main(String[] args)
	{
 		OopEmpWageRefractor dmart=new OopEmpWageRefractor("Dmart",12,34,56);
 		OopEmpWageRefractor reliance=new OopEmpWageRefractor("reliance",15,24,52);
 		OopEmpWageRefractor tcs=new OopEmpWageRefractor("tcs",22,39,30);
		dmart.computeEmpWage();
		reliance.computeEmpWage();
		tcs.computeEmpWage();


	}

}
