package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Agent;
import in.ashokit.repo.AgentRepo;


@Service
public class AgentServiceImpl implements AgentService{
	
	@Autowired
	private AgentRepo repo;

	@Override
	public String upsert(Agent agent) {
		repo.save(agent);
		
		return "insert Successfull";
	}

	@Override
	public Agent getById(Integer id) {
		Optional<Agent> byId = repo.findById(1);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public List<Agent> getAllAgent() {
		return repo.findAll();
		
	}

	@Override
	public String deleteById(Integer id) {
		   if(repo.existsById(id)) {
			   repo.deleteById(id);
		return "Data has deleted..";
		   }else {
			   return "Data is not found...";
		   }
	}
	

}

