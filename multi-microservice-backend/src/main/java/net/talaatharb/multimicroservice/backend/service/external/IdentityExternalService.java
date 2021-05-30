package net.talaatharb.multimicroservice.backend.service.external;

import org.springframework.cloud.openfeign.FeignClient;

import net.talaatharb.multimicroservice.identityservice.api.IdentityServiceApi;

@FeignClient(value = "identity-service-api", url = "${identity-service-api.url}")
public interface IdentityExternalService extends IdentityServiceApi{
}
