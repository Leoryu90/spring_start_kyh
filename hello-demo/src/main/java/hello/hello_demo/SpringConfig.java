package hello.hello_demo;

import hello.hello_demo.repository.MemberRepository;
import hello.hello_demo.repository.MemoryMemberRepository;
import hello.hello_demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
