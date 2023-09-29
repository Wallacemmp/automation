package types;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.File;
import java.io.IOException;


@Data
@NoArgsConstructor(force = true)
@Getter
@Setter

public class Users {

    @NonNull
    @JsonProperty("user")
    private String user;

    @NonNull
    @JsonProperty("email")
    private String email;

    @NonNull
    @JsonProperty("password")
    private String password;

    @NonNull
    @JsonProperty("userReg")
    private String userReg;

    @NonNull
    @JsonProperty("emailReg")
    private String emailReg;

    @NonNull
    @JsonProperty("passwordReg")
    private String passwordReg;

    public static Users get(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Users users = mapper.readValue(new File(filename), Users.class);
        //LOGGER.info("Arquivo em tempo de execução lido: '{}' ==> '{}'", filename, dadosAutenticacao);
        return users;
    }
}
