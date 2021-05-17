package com.oopempwagerefractor;

import java.util.Random;

public class OopEmpWageRefractor
{
public static final int FULL_TIME=1;
public static final int PART_TIME=2;

private static int EmpRatePerHr = 20;
private static int numOfWorkingDays = 30; 
private static int maxWorkingHr = 80;
private String company;
	
public static void main(String[] args) {
	computeEmpWage();
}		

		public static int computeEmpWage()
	{
                int empHr=0,salary=0,totalEmpWage=0,empWage=0,totalEmpHr=0, totalWorkingDays=0;
                while(totalEmpHr<=maxWorkingHr && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                
                int Result=(int)Math.floor(Math.random()*10)%3;
           
               
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
                         
                        totalEmpHr+=empHr;
                        System.out.println("Day#: "+totalWorkingDays+" empHr:"+empHr);
                        
            	}
                totalEmpWage=totalEmpHr * EmpRatePerHr;
                System.out.println("Total Emp Wage: "+totalEmpWage);
				return totalEmpWage;

            }
}