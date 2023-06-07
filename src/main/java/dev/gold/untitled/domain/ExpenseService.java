package dev.gold.untitled.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExpenseService {

  private final ExpenseRepository expenseRepository;
  private final ExpenseTypeRepository expenseTypeRepository;

  public List<Expense> getAll() {
    log.info("Executing ExpenseService::getAll");
    return expenseRepository.findAll();
  }
  
  public List<ExpenseType> getAllExpenseType() {
	log.info("Getting list of all Expense Type");
	return expenseTypeRepository.findAll();
  }
  
  public List<Expense> getAllExpenseByDate(String year, String month, String day) {
	log.info("Getting list of all Expense filtered by Date");
	return expenseRepository.findByDate(year,month,day);
	  }
}
