package ch.bozaci.homepage.access;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import ch.bozaci.homepage.entity.Player;

public class PlayerRepository extends AbstractRepository 
{
    private static final long serialVersionUID = 1L;
    
    private Logger logger = Logger.getLogger(PlayerRepository.class.getSimpleName());
    
    
    @Transactional
    public void persistUser (Player player)
    {
        logger.info("persisting player: " + player);
        persist(player);
    }
    
    public List<Player> getPlayerList()
    {
        TypedQuery<Player> query = em.createQuery("select p from Player p", Player.class);
        List<Player> playerList = query.getResultList();
        return playerList;
    }

}
