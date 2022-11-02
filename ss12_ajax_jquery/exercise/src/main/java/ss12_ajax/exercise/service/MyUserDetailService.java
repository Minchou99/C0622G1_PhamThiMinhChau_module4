package ss12_ajax.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ss12_ajax.exercise.model.MyBlogDetail;
import ss12_ajax.exercise.model.User;
import ss12_ajax.exercise.repository.IUserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User name: " + username + " not found");
        }

        return new MyBlogDetail(user);
    }
}
