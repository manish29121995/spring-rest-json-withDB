package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Agent;

public interface AgentService {
   int a = 1;

	public String upsert(Agent agent);
	
	public Agent getById(Integer id);
	
	public List<Agent> getAllAgent();
	
	public String deleteById(Integer id);
}
