package loan.approval.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import loan.approval.com.model.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long>  {

	List<LoanApplication> findByUserId(String userId);

	LoanApplication findByApplicationId(Long applicationId);
}
