import DS from 'ember-data';

export default DS.Model.extend({
  firstName: DS.attr(),
  middleName: DS.attr(),
  lastName: DS.attr(),
  emailId: DS.attr(),
  phoneNo: DS.attr(),
  role: DS.attr(),
  location: DS.attr(),
  joinDate: DS.attr(),
  picture: DS.attr(),
  bio: DS.attr(),
  skills: DS.attr(),
  department: DS.attr(),
  project: DS.attr(),
  reportEmployee: DS.attr()
});
