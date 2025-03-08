package ma.saifdine.hd.appg_consult_patients.services.consultation;

import ma.saifdine.hd.appg_consult_patients.models.Consultation;

import java.util.List;

public interface IConsultationService {

    void addConsultation(Consultation consultation);
    List<Consultation> getConsultations();
    Consultation getConsultationById(Long id);
    void updateConsultation(Consultation consultation);
    void deleteConsultation(Consultation consultation);
    List<Consultation> searchConsultationsByQuery(String query);
}
