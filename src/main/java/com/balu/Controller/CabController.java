package com.balu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.balu.Entity.CabCustomer;
import com.balu.Repo.CabRepo;

@RestController
public class CabController {

	@Autowired
	private CabRepo repo;

	@PostMapping("/addCabCustomer")
	public String addCabCustomer() {
		CabCustomer cust = new CabCustomer();
		cust.setCustomerName("rajam");
		cust.setDistance(4);
		cust.setPickupLocation("koti");
		cust.setDropLocation("Abids");
		cust.setPhone((long) 987654324);
		repo.save(cust);
		if (repo.findById((long) 99765463) != null) {
			return "Not found";
		}

		return "Saved";

	}

	static float bill = 0;

	@GetMapping("CalculateBill")
	private @ResponseBody String CalculateBill() {		
		int dist = 10;				
		if (!isFirstCustormer()) {
			
			CabCustomer cust = new CabCustomer();
			cust.setCustid(2);
			cust.setCustomerName("rajnayak");
			cust.setDistance(dist);
			cust.setPickupLocation("koti");
			cust.setDropLocation("Abids");
			cust.setPhone((long) 949213857);
			repo.save(cust);

			return printBill(bill);
		}
		if (dist <= 4) {
			bill = 80;
			return printBill(bill);
		} else {
			dist -= 4;
			dist *= 6;
			bill = 80 + dist;

			return printBill(bill);

		}

	}

	// printing for the bill

	public String printBill(Float bill) {
		String res ="";
		//Optional<CabCustomer> temp = repo.findById((long)987654324);
		
		List<CabCustomer> list = repo.findAll();
		
		for(CabCustomer i:list) {
			if(i.getPhone()==((long)949213857)) {
				res +=i.getCustomerName()+" " +"Please pay your bill of Rs "+bill;
			}
		}
		return res;

	}

	@GetMapping("/getall")
	public List<CabCustomer> getCustomers() {

		return repo.findAll();
	}

//	@PostMapping("/check")
	public boolean isFirstCustormer() {

		if (repo.existsById((long)949213857)) {

			return true;
		}
		return false;
	}

}
