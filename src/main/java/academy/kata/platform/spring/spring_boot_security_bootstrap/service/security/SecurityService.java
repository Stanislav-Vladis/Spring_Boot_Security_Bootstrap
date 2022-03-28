package academy.kata.platform.spring.spring_boot_security_bootstrap.service.security;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}
