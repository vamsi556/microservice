package olivecrypto.olive.service;

import java.util.List;

import olivecrypto.olive.domain.EmployeeProfile;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}