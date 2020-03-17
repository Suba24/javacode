package com.arithmentic.operation.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arithmentic.operation.model.DataEntity;
import com.arithmentic.operation.repository.CalculationRepository;
import com.arithmentic.operation.service.CalculationService;
import com.arithmentic.operation.util.EvaluateString;

@Service
public class CalcualationServiceImpl implements CalculationService{
	
	@Autowired
	private EvaluateString evaluateString;
	
	@Autowired
	private CalculationRepository calculationRepository;
	
	
	public EvaluateString getEvaluateString() {
		return evaluateString;
	}

	public void setEvaluateString(EvaluateString evaluateString) {
		this.evaluateString = evaluateString;
	}

	public CalculationRepository getCalculationRepository() {
		return calculationRepository;
	}

	public void setCalculationRepository(CalculationRepository calculationRepository) {
		this.calculationRepository = calculationRepository;
	}

	@Override
	public int saveData(String expression) {
		int finalOutput = getEvaluateString().evaluate(expression);
		DataEntity entity= new DataEntity();
		entity.setData(finalOutput);
		calculationRepository.save(entity);
		return finalOutput;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
