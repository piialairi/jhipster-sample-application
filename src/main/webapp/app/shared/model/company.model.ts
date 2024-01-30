export interface ICompany {
  id?: number;
  name?: string | null;
  streetAddress?: string | null;
  postalCode?: string | null;
  city?: string | null;
  email?: string | null;
  phoneNumber?: string | null;
}

export const defaultValue: Readonly<ICompany> = {};
