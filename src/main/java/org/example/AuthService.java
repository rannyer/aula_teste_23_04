package org.example;

public class AuthService {

    public String login(String usuario, String senha){
        String token = "token_gerado";
        if(usuario == null || senha == null){
            return null;
        }
        if (usuario.equals("admin") && senha.equals("1234")) {
            return "TOKEN_ABC";
        }
        return null;
    }

    public boolean isAdmin(String usuario){
        return "admin".equals(usuario);
    }
    public boolean verificarToken(String token){
        if(token.equals("TOKEN_ABC")){
            return  true;
        }
        return false;
    }
}
