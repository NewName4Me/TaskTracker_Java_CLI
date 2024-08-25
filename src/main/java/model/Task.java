package model;

import enumController.TaskEnum;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author torta
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private Long id;
    private String description;
    private TaskEnum status;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
