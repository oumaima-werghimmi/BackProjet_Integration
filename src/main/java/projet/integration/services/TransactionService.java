package projet.integration.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.integration.entities.Categorie;
import projet.integration.entities.Transaction;
import projet.integration.entities.User;

import projet.integration.repositories.TransactionRepository;
import projet.integration.services.CategorieService;


@Service
public class TransactionService {
   

    @Autowired
    CategorieService categorieService;
	@Autowired
	TransactionRepository transactionRepository;
	
	public Transaction addTransaction(Transaction t) {
		return transactionRepository.save(t);
	}
	
	public List<Transaction> findTransaction(){
		return transactionRepository.findAll();
	}
	public List<Transaction> getAllTransactionsWithCategoryName() {
        List<Transaction> transactions = transactionRepository.findAll();

        // Mettre à jour le nom de la catégorie pour chaque transaction
        for (Transaction transaction : transactions) {
            String categoryName = (transaction.getCategorie() != null)
                    ? transaction.getCategorie().getNom()
                    : null;
            transaction.setCategorieName(categoryName);
        }

        return transactions;
    }
	public Transaction updateTransaction(Transaction t) {
		return transactionRepository.save(t);
	}
	
	public void deleteTransaction(int id) {
		transactionRepository.deleteById(id);
	}
	
	
	 /*  public Transaction addTransaction(Transaction t) {
        // Vous devrez implémenter la logique pour récupérer la catégorie associée au nom
        // Puis, utilisez cette catégorie dans la création de votre Transaction.
        Categorie categorie = categorieService.findCategorieByName(t.getCategorieName());

        // Vérifiez que la catégorie existe avant de créer la transaction
        Objects.requireNonNull(categorie, "La catégorie n'existe pas.");
        t.setCategorie(categorie);
         return transactionRepository.save(t);
    }*/
	
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