package sci.travel_app.WalkTheBear.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

public interface AuthenticationFacade {
    Authentication getAuthentication();
}

