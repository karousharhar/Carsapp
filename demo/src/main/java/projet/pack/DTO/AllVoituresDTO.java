package projet.pack.DTO;

import lombok.Data;

import java.util.List;
@Data
public class AllVoituresDTO {
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<VoitureDTOgetter> voituresDTO;
}
