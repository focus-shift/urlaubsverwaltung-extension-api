package de.focus_shift.urlaubsverwaltung.extension.api.tenancy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class DefaultTenantSupplierTest {

  @Test
  void happyPath() {
    TenantSupplier tenantSupplier = new DefaultTenantSupplier("default");
    assertThat(tenantSupplier.get()).isEqualTo("default");
  }

  @Test
  void requiresNonNullValue() {
    assertThatThrownBy(() -> new DefaultTenantSupplier(null))
        .isInstanceOf(NullPointerException.class);
  }
}
