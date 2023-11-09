package projet.integration.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projet.integration.entities.Transaction;



public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

    // Méthode pour récupérer une transaction par son ID
    Transaction getDateById(int id);

    // Méthode pour récupérer toutes les transactions pour une date donnée
    List<Transaction> getAllByDate(Date date);

    // Méthode pour récupérer le montant d'une transaction par son ID
    @Query("SELECT t.montant FROM Transaction t WHERE t.id = :id")
    Double getMontantById(@Param("id") int id);
}
