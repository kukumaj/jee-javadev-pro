package pl.training.jee;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import java.time.LocalDateTime;

@Remote
public interface TimeProvider {

    @Lock(LockType.READ)
    LocalDateTime getTimestamp();

}
