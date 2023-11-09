package projet.integration.controllers;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projet.integration.entities.Transaction;
import projet.integration.services.TransactionService;


@RestController
@CrossOrigin(origins=("*"))
@RequestMapping("transaction")

public class TransactionController {
	@Autowired
	TransactionService trService;
	
	@GetMapping
	List<Transaction> all(){
		return trService.findTransaction();
	}
	
	@PostMapping()
	Transaction newTransaction(@RequestBody Transaction c) {
		return trService.addTransaction(c);
	}

	@PutMapping("/{id}")
	Transaction updateTransaction(@RequestBody Transaction t, @PathVariable int id) {
		return  trService.updateTransaction(t);
	}
	
	@DeleteMapping("/{id}")
	void deleteCategorie(@PathVariable int id) {
		trService.deleteTransaction(id);
	}

	
	
	// les fonction a tester 
    @GetMapping("/{id}")
    public Transaction getDateById(@PathVariable int id) {
        return trService.getDateById(id);
    }

    @GetMapping("/byDate")
    public List<Transaction> getAllByDate(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return trService.getAllByDate(date);
    }

    @GetMapping("/montant/{id}")
    public Double getMontantById(@PathVariable int id) {
        return trService.getMontantById(id);
    }

}
