package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "socks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Color cannot be blank")
    @Column(nullable = false)
    private String color;

    @NotNull(message = "Cotton percentage is required")
    @Min(value = 0, message = "Cotton percentage must be at least 0")
    @Max(value = 100, message = "Cotton percentage cannot exceed 100")
    @Column(name = "cotton_percentage", nullable = false)
    private Integer cottonPercentage;

    @NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity cannot be negative")
    @Column(nullable = false)
    private Integer quantity;
}