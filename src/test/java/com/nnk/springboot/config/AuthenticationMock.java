//package com.nnk.springboot.config;
//
//import lombok.experimental.UtilityClass;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableMBeanExport;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.test.context.support.WithSecurityContext;
//import org.springframework.security.test.context.support.WithSecurityContextFactory;
//
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.util.Collections;
//
//@UtilityClass
//@EnableMBeanExport
//@Configuration
//@ConditionalOnClass(value=org.springframework.security.data.repository.query.SecurityEvaluationContextExtension.class)
//public class AuthenticationMock {
//    @Retention(RetentionPolicy.RUNTIME)
//    @WithSecurityContext(factory = WithUserAuthSecurityContextFactory.class)
//    public @interface WithUserAuth {
//
//		String username();
//
//		String password();
//
//		String roles();
//    }
//
//    private static class WithUserAuthSecurityContextFactory implements WithSecurityContextFactory<WithUserAuth> {
//        @Override
//        public SecurityContext createSecurityContext(WithUserAuth annotation) {
//            SecurityContext ctx = SecurityContextHolder.createEmptyContext();
//            UserDetails user = new org.springframework.security.core.userdetails.User(
//                    "admin",
//                    "admin",
//                    Collections.singletonList(new SimpleGrantedAuthority("ADMIN")));
//            ctx.setAuthentication(new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities()));
//            return ctx;
//        }
//    }
//}
