package Diseno;

import Diseno.util.JsfUtil;
import Diseno.util.PaginationHelper;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("tipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController")
@SessionScoped
public class TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController implements Serializable {

    private TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez current;
    private DataModel items = null;
    @EJB
    private Diseno.TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController() {
    }

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getSelected() {
        if (current == null) {
            current = new TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez();
            selectedItemIndex = -1;
        }
        return current;
    }

    private TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getTipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(java.lang.Integer id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.class)
    public static class TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController controller = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezController");
            return controller.getTipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) {
                TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez o = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.class.getName());
            }
        }

    }

}
