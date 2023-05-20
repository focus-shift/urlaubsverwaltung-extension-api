package de.focus_shift.urlaubsverwaltung.extension.api.tenancy;

import static java.util.Objects.requireNonNull;

public class DefaultTenantSupplier implements TenantSupplier {
  private final String id;

  public DefaultTenantSupplier(String id) {
    requireNonNull(id);
    this.id = id;
  }

  @Override
  public String get() {
    return this.id;
  }
}
