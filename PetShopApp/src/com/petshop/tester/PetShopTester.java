package com.petshop.tester;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.AuthenticationException;
import com.petshop.Status;
import com.petshop.Category;
import com.petshop.Order;
import com.petshop.Pet;
import com.petshop.exception.AuthorizationException;
import com.petshop.exception.OutOfStockException;
import com.petshop.utils.FileIOUtils;
import com.petshop.utils.PetDataUtils;

public class PetShopTester {

	public static void main(String[] args) {

		List<Pet> petList = PetDataUtils.getPetData();
		List<Order> orderList = new ArrayList<>();

		String loginId = "";
		String pass = "";

		try (Scanner sc = new Scanner(System.in)) {

			int choice = 0;
			do {
				System.out.println("****PETSTORE****");
				System.out.println("1.Login " + "\n"
						+ "2. Add new Pet (Admin only functionality)"
						+ "\n3. Update Pet Details (Admin only functionality)" + "\n4. Display all available pets"
						+ "\n5. Order a Pet" + "\n6. Check Order status by order id"
						+ "\n7. Update order status(Admin only functionality)" + "\n8. Save data in binary file"
						+ "\n9. Read data from binary file" + "\n10. Save data in text file"
						+ "\n11. Read data from text file" + "\n0. exit)");

				System.out.println("Please Enter your choice");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1://Login
					try {
						System.out.println("Enter Login id:");
						loginId = sc.nextLine();
						System.out.println("Enter password:");
						pass = sc.nextLine();
						if (loginId.equals("admin") && pass.equals("admin")
								|| loginId.equals("c1") && pass.equals("c1")) {
							System.out.println("Authentication successful");
						} else {
							throw new AuthenticationException("Please Enter correct Login id and password");
						}

					} catch (AuthenticationException e) {

						System.out.println(e.getMessage());
					}

					break;
				case 2://Add new Pet (Admin only functionality)
					try {
						if (loginId.equals("admin")) {
							System.out.println("Enter the name of the Pet");
							String name = sc.nextLine();
							System.out.println(
									"Enter the Category of the Pet" + "\nCAT" + "\nDOG" + "\nRABBIT" + "\nFISH");
							Category category = Category.valueOf(sc.next().toUpperCase());
							System.out.println("Enter the price of the Pet");
							double price = sc.nextDouble();
							System.out.println("Enter the stock");
							int stock = sc.nextInt();

							Pet p = new Pet(name, category, price, stock);
							petList.add(p);

							System.out.println("Pet added successfully");

						} else {
							throw new AuthorizationException("You are not authorized to use this option");
						}

					} catch (AuthorizationException e) {

						System.out.println(e.getMessage());
					}

					break;
				case 3://Update Pet Details (Admin only functionality)
					try {
						if (loginId.equals("admin")) {
							petList.stream().forEach(System.out::println);
							System.out.println("Enter petId");
							int id = sc.nextInt();
							sc.nextLine();
							for (Pet p3 : petList) {

								if (p3.getPetId() == id) {
									System.out.println("Update name");
									p3.setName(sc.nextLine());
									System.out.println("Update Category");
									p3.setCategory(Category.valueOf(sc.next().toUpperCase()));
									System.out.println("Update price");
									p3.setUnitPrice(sc.nextDouble());
									System.out.println("Update Stock");
									p3.setStocks(sc.nextInt());
									System.out.println(p3);
								}
							}
						} else {
							throw new AuthorizationException("You are not authorized to use this option");
						}

					} catch (AuthorizationException e) {
						System.out.println(e.getMessage());
					}

					break;
				case 4://Display all available pets
					petList.stream().forEach(System.out::println);

					break;
				case 5://Order a Pet
					try {
						if (loginId.equals("admin") || loginId.equals("cl") ){
							System.out.println(petList);
							System.out.println("Enter the pet ID");
							int id5 = sc.nextInt();
							System.out.println("Enter the quantity");
							int quantity = sc.nextInt();
							double bill = 0;
							boolean flag = false;
							try {
								for (Pet p5 : petList) {
									if (quantity < p5.getStocks() && p5.getStocks() > 0) {
										if (p5.getPetId() == id5) {
											p5.setStocks(p5.getStocks() - quantity);
											Order o = new Order(p5.getPetId(), quantity, Status.PLACED);
											orderList.add(o);
											bill = p5.getUnitPrice() * quantity;
											System.out.println(p5.toString() + "[" + p5.getName() + "]" + "[" + bill + "]");
											flag = true;
										}
									}
								}
								if (!flag) {
									throw new OutOfStockException("Out of Stock");
								}
							} catch (OutOfStockException e) {

								System.out.println(e.getMessage());
							}
						}
						else {
							throw new AuthorizationException("You are not authorized to use this option");
						}
					} catch (AuthorizationException e) {

						System.out.println(e.getMessage());
					}

					break;
				case 6: //Check Order status by order id
					try {
						if (loginId.equals("admin") || loginId.equals("c1")) {
							System.out.println("Enter the order id");
							int orderId = sc.nextInt();
							sc.nextInt();
							for (Order order : orderList) {
								if (order.getOrderId() == orderId) {
									System.out.println(order.getStatus());
								}
							}
						} else {
							throw new AuthorizationException("You are not authorise to use this option");
						}
					} catch (AuthorizationException e) {

						System.out.println(e.getMessage());
					}

					break;
				case 7://Update order status(Admin only functionality)
					try {
						if (loginId.equals("admin")) {
							System.out.println("Please enter the pet Id :");
							int id7 = sc.nextInt();
							System.out.println("Enter the Status");
							Status status7 = Status.valueOf(sc.next());
							for (Order order : orderList) {
								if(order.getOrderId()==id7) {
									order.setStatus(status7);
									System.out.println(order.toString());
									System.out.println("Status Updated Successfully");
								}
							}

						}
						else {
							throw new AuthorizationException("You are not authorised to use this option");
						}

					} catch (AuthorizationException e) {

						System.out.println(e.getMessage());
					}

					break;
				case 8:// save data into binary file

					System.out.println("Enter the file name");
					String fileName = sc.nextLine();
					FileIOUtils.savePetData(petList,fileName);

					break;
				case 9: // read data from binary file
					System.out.println("Enter the name of file");
					String fileName9 =sc.nextLine();
					File file = new File(fileName9);
					if(file.exists()&&file.canRead()) {
						FileIOUtils.readPetData(fileName9);
					}

					break;
				case 10: // save petdata in txt file
					System.out.println("Enter the fileName");
					String fileName10=sc.nextLine();
					FileIOUtils.saveData(petList, fileName10);

					break;
				case 11:

					break;
				case 0:
					System.exit(0);
					break;

				default:
					System.err.println("Please Enter Correct choice");
					break;
				}

			} while (choice != 0);

		} catch (

				Exception e) {

			e.printStackTrace();

		}
	}

}
