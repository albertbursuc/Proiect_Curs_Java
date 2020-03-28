package sci.travel_app.WalkTheBear.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacadeImp implements AuthenticationFacade {


    public AuthenticationFacadeImp() {
        super();
    }

    @Override
    public final Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}

