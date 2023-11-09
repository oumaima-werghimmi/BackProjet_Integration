package projet.integration.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.integration.entities.Transaction;
import projet.integration.repositories.TransactionRepository;


@Service
public class TransactionService {



	@Autowired
	TransactionRepository transactionRepository;
	
	public Transaction addTransaction(Transaction t) {
		return transactionRepository.save(t);
	}
	
	public List<Transaction> findTransaction(){
		return transactionRepository.findAll();
	}
	
	public Transaction updateTransaction(Transaction t) {
		return transactionRepository.save(t);
	}
	
	public void deleteTransaction(int id) {
		transactionRepository.deleteById(id);
	}
	
	
	
	
	// les fonctions necessaire 
    public Transaction getDateById(int id) {
        return transactionRepository.getDateById(id);
    }

    public List<Transaction> getAllByDate(Date date) {
        return transactionRepository.getAllByDate(date);
    }

    public Double getMontantById(int id) {
        return transactionRepository.getMontantById(id);
    }

}