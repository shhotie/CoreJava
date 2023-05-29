package com.jobseeker.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.comparator.DateComparator;
import com.job.DataUtils;
import com.job.Degree;
import com.job.JobSeeker;

public class JobSeekerTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List <JobSeeker> jobList = DataUtils.getData();
		
		int choice = 1;

		do {
			System.out.println("1. Register Your Account" 
					+ "\n2. print all data" 
					+ "\n3. Update Your email"
					+ "\n4. Display All user as per Degree Type" 
					+ "\n5. sort as per Email using comparable"
					+ "\n6. sort as per dob using comparator " 
					+ "\n7. sort as per graduation date using comparator"
					+ "\n0. exit");

			System.out.println("Please Enter your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println(
						"Enter the details: id, name, email, password, dob,  addharId, mobileNo, grDate, degree");
				int id = sc.nextInt();
				String name = sc.next();
				String email = sc.next();
				String password = sc.next();
				LocalDate doB = LocalDate.parse(sc.next());
				String addhar = sc.next();
				String moNo = sc.next();
				LocalDate grDate = LocalDate.parse(sc.next());
				Degree degree = Degree.valueOf(sc.next());

				JobSeeker seeker = new JobSeeker(id, name, email, password, doB, addhar, moNo, grDate, degree);
				jobList.add(seeker);

				System.out.println("registration successful" + "\nYour Use id is:" + seeker.getId());
				break;
			case 2:
				for (JobSeeker list : jobList) {
					System.out.println(list);
				}
				break;

			case 3:
				System.out.println("Enter the id");
				int i = sc.nextInt();

				System.out.println("enter the email id");
				String email1 = sc.next();

				for (JobSeeker seeker1 : jobList) {
					if (i == seeker1.getId()) {
						seeker1.setEmail(email1);
						System.out.println("email id updated");
					}
				}
				break;

			case 4:
				System.out.println("Enter the degree");
				Degree degree1 = Degree.valueOf(sc.next());

				for (JobSeeker seeker1 : jobList) {
					if(seeker1.getDegree()== degree1) {
						System.out.println("As per degree type"+seeker1);
					}
				}

				break;

			case 5:
				System.out.println("JobSeeker sorted as per Ascending Order");
				Collections.sort(jobList);
				System.out.println(jobList);
				break;

			case 6:
				System.out.println("JobSeeker sorted as per Graduation Date");
				Collections.sort(jobList, new DateComparator());
				System.out.println(jobList);
				break;

			case 0:
				System.exit(0);
				break;
			}

		}while(choice != 0);
		sc.close();
	}
}
