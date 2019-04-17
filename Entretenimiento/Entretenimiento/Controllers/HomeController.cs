using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Entretenimiento.Controllers
{
    public class HomeController : Controller
    {
        // GET: Home
        public ActionResult Index()
        {
            return View();
        }
        //------------------------------------------------------------------------------
        //--------------------------------------------------VISTA INICIO SESION USUARIOS
        public ActionResult InicioSesion() //vista
        {
            return View();
        }

        public ActionResult CrearCuenta() //vista
        {
            return View();
        }

        public ActionResult Perfil() //vista solo ingresa la contraseña a la base de datos y muestra un formulario para rellenar perfil
        {
            //ingresa los datos faltantes a la base de datos del usuario        

            return View();
        }

        public ActionResult OlvidaContrasena() //vista ingresa el nombre de usuario
        {
            
            return View();
        }

        public ActionResult Ingresar_Respuesta() //vista si el usuario es correcto, ingresa la respuesta
        {
            //verifica nombre usuario
            
            
            return View();
        }

        public ActionResult EnviarCodigo() //vista ingrese el codigo que se encuentra en el correo
        {
            //verifica respuesta
            //envia correo codigo

            return View();
        }

        public ActionResult Nueva_Contrasena() //vista ingrese la nueva contraseña
        {

            //verifica el codigo

            return View();
        }

        

        //--------------------------------------------------VISTA INICIO SESION USUARIOS
        //------------------------------------------------------------------------------


    }
}