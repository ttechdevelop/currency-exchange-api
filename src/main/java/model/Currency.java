package model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Currency {
        private Long id;

        private String code;

        @JsonProperty("name")
        private String fullName;

        private String sign;

        public Currency(String code, String fullName, String sign) {
            this.code = code;
            this.fullName = fullName;
            this.sign = sign;
        }



    }

