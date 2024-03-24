package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Agent;

public interface AgentRepo extends JpaRepository<Agent, Serializable> {
	
	

}
